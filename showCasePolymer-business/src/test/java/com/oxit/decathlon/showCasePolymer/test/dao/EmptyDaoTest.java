package com.oxit.decathlon.showCasePolymer.test.dao;

import java.io.InputStream;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.XmlDataSet;
import org.dbunit.ext.hsqldb.HsqldbDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/datasource.xml",
                                    "/META-INF/spring-config/persistenceunit.xml",
                                    "/spring/propertiesLoader.xml" })
@Transactional(value="showCasePolymerTransactionManager")
public class EmptyDaoTest {
	@Autowired
	private DataSource dataSource;

	// Autowired your DAO

	@Before
	public void setUpDatabase()throws Exception{
	     // DBUnit connection
	     IDatabaseConnection dbUnitConnection = new DatabaseConnection(dataSource.getConnection());

	     // setup hsql data type factory
	     DatabaseConfig config = dbUnitConnection.getConfig();
	     config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqldbDataTypeFactory());

	     // Load the data file
	     final InputStream is = this.getClass().getResourceAsStream("/data/testCase.xml");
	     IDataSet dataSet = new XmlDataSet(is);

	     // Truncate table and insert value
	     DatabaseOperation.CLEAN_INSERT.execute(dbUnitConnection, dataSet);
	}

	@Test
	public void test01_xxx(){
		// Dao test..
	}
}
