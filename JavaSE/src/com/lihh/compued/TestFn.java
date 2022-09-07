package com.lihh.compued;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.compued
 * @Author: lihh
 * @CreateTime: 2022-09-05  22:17
 * @Description: TODO
 */
public class TestFn {

  @Before
  public void beforeFn() {
    System.out.println("before fn");
  }

  @After
  public void afterFn() {
    System.out.println("after fn");
  }

  @Test
  public void testAdd() {
    Computed c = new Computed();
    int res = c.add(20, 30);
    Assert.assertEquals(res, 50);
  }

  @Test
  public void testSub() {
    Computed c = new Computed();
    int res = c.sub(20, 10);
    Assert.assertEquals(10, 10);
  }
}
