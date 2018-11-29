package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.model.Goods;
import com.model.GoodsQuery;


public interface GoodsDao {
	/**
	 * 根据ID查询
	 * @param id主键
	 * @return 查询结果
	 */
	public Goods findById(String id);
	/**
	 * 查询全部
	 * @return 查询结果
	 */
	public List<Goods> findAll();
	/**
	 * 插入记录
	 * @param goods
	 * @return 操作成功返回1，失败返回0
	 */
	public int insert(Goods goods);
	/**
	 * 更新数据
	 * @param goods
	 * @return 操作成功返回1，失败返回0
	 */
	public int update(Goods goods);
	/**
	 * 删除数据
	 * @param id
	 * @return 操作成功返回1，失败返回0
	 */
	public int delete(String id);
	
	public Map<String,Object> findByIdForMap(String id);
	
	public List<Map<String,Object>> findAllForMap();
	
	public List<Goods> findByPage(RowBounds rowBounds);
	/**
	 * 分页查询 
	 * @param offSet 分页起始位置
	 * @param limit 分页行数
	 * @return 查询结果
	 */
	public List<Goods> findByPage2(int offSet, int limit);
	/**
	 * 根据条件查询
	 * @param goodsQuery 封装查询条件 
	 * @return 查询结果
	 */
	public List<Goods> findByGoodsQuery(GoodsQuery goodsQuery);
	
	public List<Goods> findByArray(String [] arry);
}
