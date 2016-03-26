package com.zgld.api.base;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseHibernateDaoSupport extends HibernateDaoSupport {
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param hql
	 * @return
	 */
	public List<Object> findObjectPage(int pageNum, int pageSize, String hql) {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		List<Object> list = (List<Object>) query.list();
		// if (session != null) {
		// session.close();
		// }
		return list;
	}

	/**
	 * 查询总数
	 * 
	 * @param hql
	 * @return
	 */
	public Long countObject(String hql) {
		// TODO Auto-generated method stub
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		Long count = ((Long) query.iterate().next());
		// if (session != null) {
		// session.close();
		// }
		return count;
	}

	/**
	 * 统计
	 * 
	 * @param hql
	 * @return
	 */
	public Object totalObject(String hql) {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		Object o = query.iterate().next();
		// if (session != null) {
		// session.close();
		// }
		return o;
	}

	/**
	 * 删除一个对象
	 * 
	 * @param object
	 */
	public void deleteObject(Object object) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(object);
	}

	/**
	 * 保存一个对象
	 * 
	 * @param object
	 */
	public Serializable saveObject(Object object) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().save(object);
	}

	/**
	 * 更新一个对象
	 * 
	 * @param object
	 */
	public void updateObject(Object object) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(object);
	}

	/**
	 * 查询一个对象
	 * 
	 * @param hql
	 * @return
	 */
	public Object beanObject(String hql) {
		Object object = null;
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(1);
		List<Object> list = (List<Object>) query.list();
		if (list != null) {
			for (Object object2 : list) {
				object = object2;
			}
		}
		// if (session != null) {
		// session.close();
		// }
		return object;
	}

	/**
	 * 查询所有的
	 * 
	 * @param hql
	 * @return
	 */
	public Object findAllObject(String hql) {
		return this.getHibernateTemplate().find(hql);
	}

	/**
	 * 批量更新、删除数据
	 * 
	 * @param hql
	 */
	public void updateAllObject(final String hql) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				List<Integer> result = new ArrayList<Integer>();
				Query query = session.createQuery(hql);
				result.add(query.executeUpdate());
				return result;
			}
		});
	}
}
