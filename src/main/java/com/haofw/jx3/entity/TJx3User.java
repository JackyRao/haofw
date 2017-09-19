package com.haofw.jx3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import cn.jeeweb.core.common.entity.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**   
 * @Title: 用户
 * @Description: 用户
 * @author JackyRao
 * @date 2017-09-17 12:54:58
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_jx3_user")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class TJx3User extends AbstractEntity<String> {

    /**微信ID*/
	private String openId;
    /**状态0：有效 1：其他*/
	private Integer status;
    /**绑定时间*/
	private Date bindTime;
    /**用户ID*/
	private String id;
    /**昵称*/
	private String nickName;
	
	/**
	 * 获取  openId
	 *@return: String  微信ID
	 */
	@Column(name ="open_id",nullable=true,length=64,scale=0)
	public String getOpenId(){
		return this.openId;
	}

	/**
	 * 设置  openId
	 *@param: openId  微信ID
	 */
	public void setOpenId(String openId){
		this.openId = openId;
	}
	/**
	 * 获取  status
	 *@return: Integer  状态0：有效 1：其他
	 */
	@Column(name ="status",nullable=false,length=10,scale=0)
	public Integer getStatus(){
		return this.status;
	}

	/**
	 * 设置  status
	 *@param: status  状态0：有效 1：其他
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	 * 获取  bindTime
	 *@return: Date  绑定时间
	 */
	@Column(name ="bind_time",nullable=false,length=19,scale=0)
	public Date getBindTime(){
		return this.bindTime;
	}

	/**
	 * 设置  bindTime
	 *@param: bindTime  绑定时间
	 */
	public void setBindTime(Date bindTime){
		this.bindTime = bindTime;
	}
	/**
	 * 获取  id
	 *@return: String  用户ID
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="id",nullable=false,length=32,scale=0)
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  用户ID
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  nickName
	 *@return: String  昵称
	 */
	@Column(name ="nick_name",nullable=true,length=255,scale=0)
	public String getNickName(){
		return this.nickName;
	}

	/**
	 * 设置  nickName
	 *@param: nickName  昵称
	 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
}