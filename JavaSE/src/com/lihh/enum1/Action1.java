package com.lihh.enum1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.enum1
 * @Author: lihh
 * @CreateTime: 2022-09-06  19:31
 * @Description: TODO
 */
public enum Action1 {

  Type("add", "add"),
  Tools("tools", "tools");

  private final String type;
  private final String tools;

  private Action1(String type, String tools) {
    this.type = type;
    this.tools = tools;
  }

  public String getType() {
    return type;
  }

  public String getTools() {
    return tools;
  }

  @Override
  public String toString() {
    return "Action{" +
        "type='" + type + '\'' +
        ", tools='" + tools + '\'' +
        '}';
  }
}
