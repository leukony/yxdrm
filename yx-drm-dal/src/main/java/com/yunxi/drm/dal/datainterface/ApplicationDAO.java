package com.yunxi.drm.dal.datainterface;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yunxi.drm.dal.dataobject.ApplicationDO;

/**
 * 应用DAO
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: ApplicationDAO.java, v 0.1 2017年6月8日 下午3:55:04 leukony Exp $
 */
@Mapper
public interface ApplicationDAO {

    @Insert("INSERT INTO drm_app(app_name,app_domain) VALUES (#{appName},#{appDomain})")
    int insert(ApplicationDO application);
    
    @Delete("DELETE FROM drm_app WHERE app_name = #{appName} AND app_domain = #{appDomain}")
    int delete(ApplicationDO application);
    
    @Select("SELECT app_name,app_domain FROM drm_app WHERE app_name = #{appName} AND app_domain = #{appDomain}")
    ApplicationDO selectByNameAndDomain(@Param("appName") String appName, @Param("appDomain") String appDomain);
}