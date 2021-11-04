package br.com.pedrodavi.creational.factory.app.dbadapter.factory;

import br.com.pedrodavi.creational.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
