package tw.com.lccnet.model.base;

public interface BaseDao<T> {
		
		//新增(抽象方法) T 實作會轉換成特定型態(使用實體)
		public void add(T t);
		//刪除
		public void delete(int id);
		//更新
		public void update(T t);
		//修改
}
