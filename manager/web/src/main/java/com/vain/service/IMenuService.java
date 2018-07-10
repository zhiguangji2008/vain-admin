package com.vain.service;


import com.vain.base.service.BaseService;
import com.vain.common.ErrorCodeException;
import com.vain.entity.Menu;
import com.vain.entity.Role;
import com.vain.entity.User;

import java.util.HashSet;
import java.util.List;

/**
 * Created by vain on 2017/9/23.
 * 菜单
 */
public interface IMenuService extends BaseService<Menu> {


    List<Menu> getMenusByUser(User user) throws ErrorCodeException;

    HashSet<Menu> getMenusByUserId(Integer userId, Integer userType);

    /**
     * 获取所有数据
     *
     * @param entity      参数实体
     * @param isHierarchy 是否返回层级结构 父子
     * @return
     */
    List<Menu> getList(Menu entity, boolean isHierarchy) throws ErrorCodeException;


    List<Menu> getMyMenus(Menu entity) throws ErrorCodeException;

    /**
     * 通过角色id获取角色所有的菜单权限
     *
     * @param entity
     * @return
     */
    List<Menu> getMenusByRoleId(Role entity) throws ErrorCodeException;

    /**
     * 获取menukey 的子集菜单
     *
     * @param dataList
     * @param menuKey
     * @return
     */
    List<Menu> getChildMenu(List<Menu> dataList, String menuKey);
}
