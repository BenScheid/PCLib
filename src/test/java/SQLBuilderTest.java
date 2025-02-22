package db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lu.pcy113.pclib.db.DataBaseConnector;
import lu.pcy113.pclib.db.SQLBuilder;

public class SQLBuilderTest {
	
	@Test
	public void test() {
		System.out.println(SQLBuilder.safeSelect(new DBTest(new DataBaseConnector()).TABLE, new String[] {"a", null, "b"}));
		System.out.println(SQLBuilder.safeUpdate(new DBTest(new DataBaseConnector()).TABLE, new String[] {"a", null, "b"}, new String[] {"a", null}));
		System.out.println(SQLBuilder.safeDelete(new DBTest(new DataBaseConnector()).TABLE, new String[] {"a", null, "b"}));
		System.out.println(SQLBuilder.safeInsert(new DBTest(new DataBaseConnector()).TABLE, new String[] {"a", null, "b"}));
		// System.out.println(SQLBuilder.safeSelectUniqueCollision(new DBTest(new DataBaseConnector()).TABLE, new String[] {"a", null, "b"}));
	}
}
