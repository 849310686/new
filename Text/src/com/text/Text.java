package com.text;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.GoodsDao;
import com.model.Goods;
import com.model.GoodsQuery;


public class Text {

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
		    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
		        .build(Resources.getResourceAsReader("mybatis.xml"));
		    sqlSession = sessionFactory.openSession();
		    GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
		    /*   Goods goods = goodsDao.findById("0001");
		    if(goods!=null) {
		    	System.out.println(goods.getId());
		    	System.out.println(goods.getName());
		    	System.out.println(goods.getPrice());
		    }*/
			/*	
		    List<Goods> list = goodsDao.findAll();
		    if(list!=null) {
		    	for(Goods g:list) {
		    		System.out.println(g.getId());
		    		System.out.println(g.getName());
		    		System.out.println(g.getPrice());
		    	}
		    }
		    Goods goods=new Goods();		    
		    goods.setId("0008");
		    goods.setName("黑鲨手机");
		    goods.setPrice(6000.00);
		    int insert = goodsDao.insert(goods);
		    if(insert!=0) {
		    	System.out.println("操作成功");
		    }*/
		    Goods goods = new Goods();
		    goods.setId("0008");
		    goods.setPrice(9500.00);
		    int update = goodsDao.update(goods);
		    if(update!=0) {
		    	System.out.println("修改成功");
		    }
/*		    int delete = goodsDao.delete("0008");
		    if(delete!=0) {
		    	System.out.println("删除成功");
		    }*/
/*		    Map<String, Object> map = goodsDao.findByIdForMap("0001");
		    if(map!=null) {
		    	System.out.println(map.get("ID"));
		    	System.out.println(map.get("NAME"));
		    	System.out.println(map.get("PRICE"));
		    }*/
		    //在获取map集合的value值中，key值是数据库字段名大写
/*		    List<Map<String, Object>> list = goodsDao.findAllForMap();
		    if(list!=null) {
		    	for(Map<String, Object> map:list) {
			    	System.out.println(map.get("ID"));
			    	System.out.println(map.get("NAME"));
			    	System.out.println(map.get("PRICE"));
		    	}
		    }*/
		    //执行增删改查
		    
		    
		    //0是开始行数   取几行
/*		    List<Goods> list = goodsDao.findByPage(new RowBounds(0, 3));
		    if(list!=null) {
		    	for(Goods map:list) {
			    	System.out.println(map.getId());
			    	System.out.println(map.getName());
			    	System.out.println(map.getPrice());
		    	}
		    }
		   
		}    
*/	
/*		    List<Goods> list = goodsDao.findByPage2(0,2);
		    if(list!=null) {
		    	for(Goods g:list) {
		    		System.out.println(g.getId());
		    		System.out.println(g.getName());
		    		System.out.println(g.getPrice());
		    	}
		    }*/
		    // 提交事务
		    
		    
/*		    Goods goods=new Goods();		    
		    goods.setId("0008");
		    goods.setName("黑鲨手机");
		    int insert = goodsDao.insert(goods);
		    if(insert!=0) {
		    	System.out.println("操作成功");
		    }*/
/*		    GoodsQuery goodsQuery=new GoodsQuery();
		    //goodsQuery.setName("手机");
		    goodsQuery.setMaxPrice(5000.00);
		    goodsQuery.setMinPrice(1000.00);
		    List<Goods> list = goodsDao.findByGoodsQuery(goodsQuery);
		    if(list!=null) {
		    	for(Goods g:list) {
		    		System.out.println(g.getId());
		    		System.out.println(g.getName());
		    		System.out.println(g.getPrice());
		    	}
		    }*/
/*		    String[] arry= {"0002","0004","0006"};
		    List<Goods> list = goodsDao.findByArray(arry);
		    for(Goods g:list) {
		    	System.out.println(g.getId());
	    		System.out.println(g.getName());
	    		System.out.println(g.getPrice());
		    }*/
		    sqlSession.commit();
		}
		    catch (Exception e) {
		    e.printStackTrace();
		    sqlSession.rollback();
		} finally {
		    if (sqlSession != null) {
		       sqlSession.close();
		    }
		}
}
}