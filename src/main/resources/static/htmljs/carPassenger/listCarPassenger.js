
jQuery(function($) {
    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";

    jQuery(grid_selector).jqGrid({
        url: '/carPassenger/selectByExample',
        datatype: "json",
        mtype: "post",
        colModel:[
            {label:'tId',name:'id', editable:false,hidden:true },
            {label:'联系人',name:'tLinkman', editable: true },
            {label:'性别',name:'tSex', editable: true },
            {label:'手机号',name:'tPhone',  editable: true},
            {label:'出发地',name:'tPoint', editable: true},
            {label:'目的地',name:'tDestination', editable: true},
            {label:'出发日期',name:'tDepart', editable: true},
            {label:'乘成人数',name:'tNumPeople', editable: true},
            {label:'参考车费',name:'tFare', editable: true},
            {label:'发布人',name:'tIssuer', editable: true}
        ],
        viewrecords : true,//定义是否要显示总记录数
        rowNum:10,//每页显示的条数
        rownumbers: true,
        rowList:[10,20,30],//用来改变显示记录数
        pager : pager_selector,//定义翻页用的导航栏
        height: 'auto',        //自动行高
        shrinkToFit:false,  //设置为true时，列数充满表格，当列数较多时，只会缩小列宽，并不会出现滚动条，需要将属性设置为false
        autoScroll: true,    //设置滚动条
        altRows: true,//设置行交替样式
        multiselect: true, //是否可以多选
        loadComplete : function() {
            var table = this;
            setTimeout(function(){
                updatePagerIcons(table);
            }, 0);
        },
        autowidth: true// 如果为ture时，则当表格在首次被创建时会根据父元素比例重新调整表格宽度。如果父元素宽度改变，为了使表格宽度能够自动调整则需要实现函数：setGridWidth
    });

    function operation(cellvalue, options, rowObject) {
        var htmlstr = "<div class='visible-md visible-lg hidden-sm hidden-xs btn-group'>"
            + "<button class='btn btn-xs btn-info' onclick=openEditDiag('"
            + rowObject.id
            + "')><i class='icon-edit bigger-120'></i>编辑</button></div>";
        return htmlstr;
    }

    function updatePagerIcons(table) {
        var replacement =
            {
                'ui-icon-seek-first' : 'icon-double-angle-left bigger-140',
                'ui-icon-seek-prev' : 'icon-angle-left bigger-140',
                'ui-icon-seek-next' : 'icon-angle-right bigger-140',
                'ui-icon-seek-end' : 'icon-double-angle-right bigger-140'
            };
        $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
            var icon = $(this);
            var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
        })
    }
});

function refresh() {
    $("#grid-table").trigger("reloadGrid");
}

/**
 * 查询\刷新
 */
function selText() {
    // 使用jqgrid中的方法
    $("#grid-table").jqGrid('setGridParam',{
        postData:{
            'deptName' : $("#deptName").val()
        }
    }).trigger("reloadGrid"); //重新载入
}

/**
 * 删除
 */
function deletes() {
    //获取值
    var ids=$('#grid-table').jqGrid('getGridParam','selarrrow');
    var row="";
    //var id = $("grid-table").jqGrid('getDataIDs');
    //遍历访问这个集合
    $(ids).each(function (index, id){
        //由id获得对应数据行
        var name= jQuery('#grid-table').jqGrid('getCell',id,'id');//name是colModel中的一属性
        if(name != 1) {
            row += name+",";
        }
    });
    row=row.substr(0,row.length-1);

    if(ids != null && ids != "") {
        layer.confirm('此操作不可逆,是否继续？', {
            btn: ['继续','取消'] //按钮
        }, function(){
            $.ajax({
                url: '/carPassenger/deleteByPrimaryKey',
                data: {'ids':row},
                type: "POST",
                success: function (result) {
                    if (result >= "1") {
                        layer.msg('操作成功', {icon: 1});
                        selText();
                    } else {
                        layer.alert('操作失败,或总部不能删除', {icon: 1});
                    }
                }
            });

        });
    } else {
        layer.msg("请选择要操作的数据!");
    }
}

/**
 * 部门编辑
 * @param uuid
 */
function openEditDiag(uuid) {
    //页面层
    var indext = layer.open({
        type: 2,
        title:'部门编辑',
        area: ['70%', '80%'],
        fixed: false, //不固定
        maxmin: true,
        content: '/dept/updDeptView?id='+uuid,
        btn:['确定','取消'],
        yes: function (layero, index) {
            var iframeWin = window[index.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
            //调用授权提交方法
            iframeWin.mySubmit();
        } ,
    });
}


/**
 * 增加
 */
function openAddDiag() {
    //页面层
    var indext = layer.open({
        type: 2,
        title:'部门增加',
        area: ['70%', '80%'],
        fixed: false, //不固定
        maxmin: true,
        content: '/dept/addDeptView',
        btn:['确定','取消'],
        yes: function (layero, index) {
            var iframeWin = window[index.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
            //调用授权提交方法
            iframeWin.mySubmit();
        } ,
    });
}

/**
 * 提交
 */
function mySubmit(){

    $.ajax({
        url: '/dept/addDept',
        data: $("#aouDept").serialize(),
        type: "POST",
        async: true,
        dataType: "json",
        success: function (result) {
            if (result == "1") {
                layer.alert('操作成功！',function () {
                    parent.location.reload(); // 父页面刷新
                });
            } else {
                layer.msg('对不起，操作失败！');
            }
        }
    });
}

function formatDatebox(Value, options, rowObject){

    var time = new Date(Value);
    var y = time.getFullYear();
    var m = time.getMonth()+1;
    var d = time.getDate();
    return y+'-'+add(m)+'-'+add(d);
}
function add(m){return m<10?'0'+m:m };


