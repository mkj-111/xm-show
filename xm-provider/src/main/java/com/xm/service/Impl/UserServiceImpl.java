package com.xm.service.Impl;

import com.xm.dao.UserMapper;
import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import com.xm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private com.xm.dao.UserMapper UserMapper;

    @Override
    public SysUser selectUserInfoByCode(String userCode) {
        return UserMapper.selectUserInfoByCode(userCode);
    }

    @Override
    public List<xmtree> selectTreeList(Integer userId) {
        Integer pid = 1;
        List<xmtree> treeList = nodesList(pid, userId);
        return treeList;
    }

    @Override
    public List<String> selectPowerKeyList(Integer userId) {

        return UserMapper.selectPowerKeyList(userId);
    }

    private List<xmtree> nodesList(Integer pid, Integer userId){
        List<xmtree> treeList = UserMapper.selectTreeList(pid, userId);
        for (xmtree tree :
                treeList) {
            List<xmtree> nodeList = nodesList(tree.getId(), userId);
            // 没有子节点
            if(nodeList == null || nodeList.size() <= 0) {
                tree.setSelectable(true);
                tree.setLeaf(true);
            } else {
                tree.setSelectable(false);
                tree.setNodes(nodeList);
            }
        }
        return treeList;
    }
}
