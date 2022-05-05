package com.qf;

import com.qf.entity.TbItem;
import com.qf.dao.TbItemDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    SqlSession sqlSession;
    TbItemDao tbItemDao;

    @Before
    public void init() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        sqlSession = build.openSession(true);
        tbItemDao = sqlSession.getMapper(TbItemDao.class);
    }

    @After
    public void close() throws Exception {
        sqlSession.close();
    }

    @Test
    public void test01() throws Exception {
        TbItem tbItem = tbItemDao.queryById(536563L);
        System.out.println(tbItem);

    }

    @Test
    public void test02() throws Exception {
        List<TbItem> tbItems = tbItemDao.queryAll(null);
        tbItems.forEach(tbItem -> System.out.println(tbItem));
    }


}
