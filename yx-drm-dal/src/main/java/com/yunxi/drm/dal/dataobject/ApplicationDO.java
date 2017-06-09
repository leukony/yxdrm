package com.yunxi.drm.dal.dataobject;

/**
 * 应用DO
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: ApplicationDO.java, v 0.1 2017年6月8日 下午3:53:04 leukony Exp $
 */
public class ApplicationDO {
    
    /** 主键ID */
    private long id;
    
    /** 应用名称 */
    private String appName;
    
    /** 应用名称 */
    private String appDomain;

    /**
      * Getter method for property <tt>id</tt>.
      * 
      * @return property value of id
      */
    public long getId() {
        return id;
    }

    /**
      * Setter method for property <tt>id</tt>.
      * 
      * @param id value to be assigned to property id
      */
    public void setId(long id) {
        this.id = id;
    }

    /**
      * Getter method for property <tt>appName</tt>.
      * 
      * @return property value of appName
      */
    public String getAppName() {
        return appName;
    }

    /**
      * Setter method for property <tt>appName</tt>.
      * 
      * @param appName value to be assigned to property appName
      */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
      * Getter method for property <tt>appDomain</tt>.
      * 
      * @return property value of appDomain
      */
    public String getAppDomain() {
        return appDomain;
    }

    /**
      * Setter method for property <tt>appDomain</tt>.
      * 
      * @param appDomain value to be assigned to property appDomain
      */
    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }
}