$(function () {
    treeMenu();
    getSessionUser();
    $("#SessionUser").click(function () {
        pwdUpd();
    })
});

/**
 * 获取用户
 */
function getSessionUser() {
    $.ajax({
        url: '/session/loginSession',
        type: "POST",
        async: true,
        dataType: "json",
        success: function (result) {
            if (result != null) {
                $("#SessionUser").html(result.userName);
            } else {

            }
        }
    });
}

/**
 * 加载菜单
 */
function treeMenu() {
    var treeMenu = "";

    $.ajax({
        url: "/menu/menuTree",
        type: "POST",
        async: true,
        dataType: "json",
        success: function (result) {

            $.each(result, function (index, item) {
                if(item.pid == 0) {
                    treeMenu+="<li id = "+item.id+">" +
                        "<a href='#' class='dropdown-toggle'>" +
                        "<i class="+item.iconCls+"></i>" +
                        "<span class='menu-text'>"+item.text+"  </span>" +
                        "<b class='arrow icon-angle-down'></b>" +
                        "</a><ul class='submenu'>";
                }
                $.each(result, function (index, itemobj) {
                    if(item.id == itemobj.pid ) {
                        treeMenu+="<li id="+itemobj.id+">" +
                            "<a href="+itemobj.url+"?pid="+item.id+"&id="+itemobj.id+">" +
                            "<i class=\"icon-double-angle-right\"></i>" +
                            itemobj.text +
                            "</a>" +
                            "</li>";
                    }
                });
                if(item.pid == 0) {
                    treeMenu+="</ul></li>";
                }
            });
            $("#treeMenu").html(treeMenu);
        }
    });

}

// 退出系统
function logout() {
    window.location.href = '/login';
}

/**
 * 修改密码
 */
function pwdUpd() {
    var userName = $("#SessionUser").html();
    //页面层
    var indext = layer.open({
        type: 2,
        title:'密码修改',
        area: ['70%', '80%'],
        fixed: false, //不固定
        maxmin: true,
        content: '/pwd/toPwdUpdatePage?userName='+userName,
        btn:['确定','取消'],
        yes: function (layero, index) {
            var iframeWin = window[index.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
            //调用授权提交方法
            iframeWin.mySubmit();
        } ,
    });
}

/**
 * 修改密码提交
 */
function mySubmit(){
    $.ajax({
        url: '/pwd/pwdUpdSubmit',
        data:$("#pwd").serialize(),
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