package tw.com.lccnet.window.dao;

import java.util.List;
	/*
	 * 資料庫四個基本功能 CRUD
	 * 1.新增
	 * 2.刪除
	 * 3.更新
	 * 4.搜尋
	 */

public interface DaoBase<T> {
		//1.新增
		public void add(T t);
		//2.刪除
		public void delete(int id);
		//3.更新
		public void update(int id);
		//4.搜尋
		public List<T> search();
}
