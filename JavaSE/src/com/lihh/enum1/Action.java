package com.lihh.enum1;

/**
 * @BelongsProject: Java-learn
 * @BelongsPackage: com.lihh.enum1
 * @Author: lihh
 * @CreateTime: 2022-09-06  19:18
 * @Description: TODO
 */
public class Action {
  private final String type;
  private final String tools;

  private Action(String type, String tools) {
    this.type = type;
    this.tools = tools;
  }

  public static final Action Type = new Action("add", "add");
  public static final Action Tools = new Action("tools", "tools");

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
