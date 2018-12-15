package com.dc.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.bean.User;
import com.dc.dao.UserDao;
import com.dc.dao.impl.UserDaoImpl;
import com.dc.exception.DataAccessLayerException;
import com.dc.service.UserService;


@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	private  static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class); 

	public void saveUser(User user) throws DataAccessLayerException{
		userDao.saveUser(user);
	}

	public void deleteUser(int Id) throws DataAccessLayerException {
		userDao.deleteUser(Id);
	}

	public void updateUser(User user) throws DataAccessLayerException {
		userDao.updateUser(user);
	}

	@Override
	public List<User> findAllusers() throws DataAccessLayerException {
		return userDao.findAllusers();
	}

	@Override
	public User findUserById(int userId) throws DataAccessLayerException {
		return  userDao.findUserById(userId);
	}

}
