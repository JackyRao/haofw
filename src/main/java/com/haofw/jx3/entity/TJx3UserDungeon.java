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
 * @Title: 用户副本CD
 * @Description: 用户副本CD
 * @author JackyRao
 * @date 2017-09-17 09:14:46
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_jx3_user_dungeon")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class TJx3UserDungeon extends AbstractEntity<String> {

    /**副本CD*/
	private String cd;
    /**创建时间*/
	private Date createTime;
    /**ID*/
	private String id;
    /**副本ID*/
	private String did;
    /**0正常 1其他*/
	private Integer status;
    /**更新时间*/
	private Date updateTime;
	/**
	 * 获取  cd
	 *@return: String  副本CD
	 */
	@Column(name ="cd",nullable=true,length=255,scale=0)
	public String getCd(){
		return this.cd;
	}

	/**
	 * 设置  cd
	 *@param: cd  副本CD
	 */
	public void setCd(String cd){
		this.cd = cd;
	}
	/**
	 * 获取  createTime
	 *@return: Date  创建时间
	 */
	@Column(name ="create_time",nullable=true,length=19,scale=0)
	public Date getCreateTime(){
		return this.createTime;
	}

	/**
	 * 设置  createTime
	 *@param: createTime  创建时间
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
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
	 * 获取  did
	 *@return: String  副本ID
	 */
	@Column(name ="did",nullable=true,length=32,scale=0)
	public String getDid(){
		return this.did;
	}

	/**
	 * 设置  did
	 *@param: did  副本ID
	 */
	public void setDid(String did){
		this.did = did;
	}
	/**
	 * 获取  status
	 *@return: Integer  0正常 1其他
	 */
	@Column(name ="status",nullable=true,length=10,scale=0)
	public Integer getStatus(){
		return this.status;
	}

	/**
	 * 设置  status
	 *@param: status  0正常 1其他
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	/**
	 * 获取  updateTime
	 *@return: Date  更新时间
	 */
	@Column(name ="update_time",nullable=true,length=19,scale=0)
	public Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 * 设置  updateTime
	 *@param: updateTime  更新时间
	 */
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
	
}
