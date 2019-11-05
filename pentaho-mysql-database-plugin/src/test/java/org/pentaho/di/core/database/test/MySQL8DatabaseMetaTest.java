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

package org.pentaho.di.core.database.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.pentaho.di.core.database.MySQL8DatabaseMeta;

/**
 * 
 * 
 * @author Sun
 * @since 2019年9月6日
 * @version
 * 
 */
public class MySQL8DatabaseMetaTest {

  @Test
  public void testDriverClass() {
    MySQL8DatabaseMeta dbMeta = new MySQL8DatabaseMeta();
    assertEquals("com.mysql.cj.jdbc.Driver", dbMeta.getDriverClass());
  }

  @Test
  public void testDefaultDatabasePort() {
    MySQL8DatabaseMeta dbMeta = new MySQL8DatabaseMeta();
    assertEquals(3306, dbMeta.getDefaultDatabasePort());
  }

}
