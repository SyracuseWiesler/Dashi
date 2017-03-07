package api;

import db.DBConnection;
import db.MongoDBConnection;
import db.MySQLDBConnection;

public class DBTransfer {
	public static DBConnection createDBConnection () {
		return new MySQLDBConnection();
//		 return new MongoDBConnection();
	}
}
