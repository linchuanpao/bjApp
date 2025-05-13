package com.bj.common.util;

/**
 *
 */
public class Test001 {

    /**
     * 查询用户名字
     * @return 返回用户名字
     */
    public String queryUserName(Long userId) {
        if (userId == null) {
            return null;
        }
        if (userId == 1L) {
            return "John Doe";
        }
        if (userId == 2L) {
            return "Jane Doe2";
        }
        return "John Doe3"; // 示例返回值
    }

}

