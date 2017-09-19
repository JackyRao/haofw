package com.haofw.jx3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import cn.jeeweb.core.common.entity.AbstractEntity;
import java.util.Date;

/**   
 * @Title: 绑定职业表
 * @Description: 绑定职业表
 * @author JackyRao
 * @date 2017-09-17 12:55:56
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_jx3_user_career")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class TJx3UserCareer extends AbstractEntity<String> {

    /**用户帐号*/
	private String loginName;
    /**自定义备注*/
	private String remark;
    /**用户ID*/
	private String uid;
    /**CREATE_TIME*/
	private Date createTime;
    /**STATUS*/
	private Integer status;
    /**ID*/
	private String id;
    /**角色名字*/
	private String nickName;
    /**职业ID*/
	private Integer careerId;
    /**UPDATE_TIME*/
	private Date updateTime;
	/**
	 * 获取  loginName
	 *@return: String  用户帐号
	 */
	@Column(name ="login_name",nullable=true,length=255,scale=0)
	public String getLoginName(){
		return this.loginName;
	}

	/**
	 * 设置  loginName
	 *@param: loginName  用户帐号
	 */
	public void setLoginName(String loginName){
		this.loginName = loginName;
	}
	/**
	 * 获取  remark
	 *@return: String  自定义备注
	 */
	@Column(name ="remark",nullable=true,length=255,scale=0)
	public String getRemark(){
		return this.remark;
	}

	/**
	 * 设置  remark
	 *@param: remark  自定义备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 * 获取  uid
	 *@return: String  用户ID
	 */
	@Column(name ="uid",nullable=true,length=32,scale=0)
	public String getUid(){
		return this.uid;
	}

	/**
	 * 设置  uid
	 *@param: uid  用户ID
	 */
	public void setUid(String uid){
		this.uid = uid;
	}
	/**
	 * 获取  createTime
	 *@return: Date  CREATE_TIME
	 */
	@Column(name ="create_time",nullable=true,length=19,scale=0)
	public Date getCreateTime(){
		return this.createTime;
	}

	/**
	 * 设置  createTime
	 *@param: createTime  CREATE_TIME
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	/**
	 * 获取  status
	 *@return: Integer  STATUS
	 */
	@Column(name ="status",nullable=true,length=10,scale=0)
	public Integer getStatus(){
		return this.status;
	}

	/**
	 * 设置  status
	 *@param: status  STATUS
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	 * 获取  id
	 *@return: String  ID
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
	 *@param: id  ID
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  nickName
	 *@return: String  角色名字
	 */
	@Column(name ="nick_name",nullable=true,length=255,scale=0)
	public String getNickName(){
		return this.nickName;
	}

	/**
	 * 设置  nickName
	 *@param: nickName  角色名字
	 */
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	/**
	 * 获取  careerId
	 *@return: Integer  职业ID
	 */
	@Column(name ="career_id",nullable=true,length=10,scale=0)
	public Integer getCareerId(){
		return this.careerId;
	}

	/**
	 * 设置  careerId
	 *@param: careerId  职业ID
	 */
	public void setCareerId(Integer careerId){
		this.careerId = careerId;
	}
	/**
	 * 获取  updateTime
	 *@return: Date  UPDATE_TIME
	 */
	@Column(name ="update_time",nullable=true,length=19,scale=0)
	public Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 * 设置  updateTime
	 *@param: updateTime  UPDATE_TIME
	 */
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	
}
