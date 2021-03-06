package com.jk.service.information;

import com.jk.entity.reception.TInformation;

import java.util.List;

public interface InformationService {
    List<TInformation> selectInformation(TInformation tInformation);

    List<TInformation> selectByExample(TInformation tInformation);

    TInformation selectByPrimaryKey(String id);

    int deleteByPrimaryKey(List<String> idlist);

    int insertInformation(TInformation tInformation);

    int updateInformation(TInformation tInformation);

    TInformation getInformationByTid(TInformation tInformation);

    int removeInformation(TInformation tInformation);

    List<TInformation> getInformationListByUser(TInformation tInformation);
}
