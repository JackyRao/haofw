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

/**   
 * @Title: JX3职业列表
 * @Description: JX3职业列表
 * @author JackyRao
 * @date 2017-09-17 11:16:47
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_jx3_career")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class TJx3Career extends AbstractEntity<String> {

    /**ID*/
	private String id;
    /**角色名称*/
	private String careerName;
    /**角色图标路径*/
	private String careerIcon;
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
	 * 获取  careerName
	 *@return: String  角色名称
	 */
	@Column(name ="career_name",nullable=true,length=255,scale=0)
	public String getCareerName(){
		return this.careerName;
	}

	/**
	 * 设置  careerName
	 *@param: careerName  角色名称
	 */
	public void setCareerName(String careerName){
		this.careerName = careerName;
	}
	/**
	 * 获取  careerIcon
	 *@return: String  角色图标路径
	 */
	@Column(name ="career_icon",nullable=true,length=255,scale=0)
	public String getCareerIcon(){
		return this.careerIcon;
	}

	/**
	 * 设置  careerIcon
	 *@param: careerIcon  角色图标路径
	 */
	public void setCareerIcon(String careerIcon){
		this.careerIcon = careerIcon;
	}
	
}
