/*******************************************************************************
 *
 * 
 *
 * Copyright (C) 2011-2019 by Sun : http://www.kingbase.com.cn
 *
 *******************************************************************************
 *
 *
 *    Email : snj1314@163.com
 *
 *
 ******************************************************************************/

package org.pentaho.di.core.database;

import org.pentaho.di.core.plugins.DatabaseMetaPlugin;

/**
 * 
 * 
 * @author Sun
 * @since 2019年9月5日
 * @version
 * 
 */
@DatabaseMetaPlugin(type = "MYSQL8+", typeDescription = "MySQL 8+ Database")
public class MySQL8DatabaseMeta extends MySQLDatabaseMeta implements DatabaseInterface {

  @Override
  public String getDriverClass() {
    if (getAccessType() == DatabaseMeta.TYPE_ACCESS_ODBC) {
      return "sun.jdbc.odbc.JdbcOdbcDriver";
    } else {
      return "com.mysql.cj.jdbc.Driver";
    }
  }

  @Override
  public void addDefaultOptions() {
    addExtraOption(getPluginId(), "characterEncoding", "UTF-8");
    addExtraOption(getPluginId(), "defaultFetchSize", "500");
    addExtraOption(getPluginId(), "useCursorFetch", "true");
    addExtraOption(getPluginId(), "userSSL", "false");
    addExtraOption(getPluginId(), "serverTimezone", "UTC");
  }

}
