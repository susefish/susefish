package com.susefish.dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 * 数据持久层，专注于对数据库的增删改查操作
 * @author 闻化东
 */
@Component("dao")
@SuppressWarnings("unchecked")
public class Dao
{
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	//通用插入
	public Object get(final Class obj, String id) throws SQLException
	{
		return hibernateTemplate.get(obj, id);
	}
	
	//通用插入
	public void save(final Object obj) throws SQLException
	{
		hibernateTemplate.save(obj);
	}
	
	//通用合并
	public void merge(final Object obj) throws SQLException
	{
		hibernateTemplate.merge(obj);
	}
	
	//通用插入Or更新
	public void saveOrUpdate(final Object obj) throws SQLException
	{
		hibernateTemplate.saveOrUpdate(obj);
	}
	
	//通用更新
	public void update(final Object obj) throws SQLException
	{
		hibernateTemplate.update(obj);
	}
	
	//通用删除
	public void delete(final Object obj) throws SQLException
	{
		hibernateTemplate.delete(obj);
	}
	
	//获得最大记录数
	public long findMaxRow(final String hql, final Object[] obj, final Type[] type) throws SQLException
	{
		Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameters(obj, type);
		query.setCacheable(true);//激活查询缓存
		return (Long)query.list().get(0);
	}
	
	//通用查詢1(分页)
	public List findByHql(final String hql, final Object[] obj, final Type[] type, final int pageNo, final int pageSize, final boolean iscache) throws SQLException
	{
		Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);	
		query.setFirstResult(pageNo>1 ? (pageNo-1) * pageSize:0); //设置起始记录条数
		query.setMaxResults(pageSize); //设置每次查询最大条数 
		query.setParameters(obj, type);
		query.setCacheable(iscache); //是否激活查询缓存	
		return query.list();
	}
	
	//通用查询2
	public List findByHql(final String hql ,final Object[] obj, final Type[] type, final boolean iscache) throws SQLException
	{
		Query query = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);	
		query.setParameters(obj, type);
		query.setCacheable(iscache); //是否激活查询缓存	
		return query.list();
	}
	
	//通用查询3
	public List findByHql(final String hql ,final Object[] obj) throws SQLException
	{
		return hibernateTemplate.find(hql, obj);
	}
	
	//通用hql
	public void executeUpdateByHql(final String hql, final Object[] obj, final Type[] type)
	{
		hibernateTemplate.execute(new HibernateCallback() 
		{
		     public Object doInHibernate(Session session)
		     {
					Query query = session.createQuery(hql);
					query.setParameters(obj, type); //设置条件参数
					return query.executeUpdate();
		     }
		});
	}
	
}