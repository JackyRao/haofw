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
 * @Title: 副本
 * @Description: 副本
 * @author JackyRao
 * @date 2017-09-17 11:25:54
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_jx3_dungeon")
@DynamicUpdate(false)
@DynamicInsert(false)
@SuppressWarnings("serial")
public class TJx3Dungeon extends AbstractEntity<String> {

    /**人数*/
	private Integer peopleNumber;
    /**下次刷新时间*/
	private Date nextRefreshTime;
    /**ID*/
	private String id;
    /**上次刷新时间*/
	private Date lastRefreshTime;
    /**副本刷新周期 天数*/
	private Integer refreshCycle;
    /**副本名字*/
	private String dungeonName;
	/**
	 * 获取  peopleNumber
	 *@return: Integer  人数
	 */
	@Column(name ="people_number",nullable=true,length=10,scale=0)
	public Integer getPeopleNumber(){
		return this.peopleNumber;
	}

	/**
	 * 设置  peopleNumber
	 *@param: peopleNumber  人数
	 */
	public void setPeopleNumber(Integer peopleNumber){
		this.peopleNumber = peopleNumber;
	}
	/**
	 * 获取  nextRefreshTime
	 *@return: Date  下次刷新时间
	 */
	@Column(name ="next_refresh_time",nullable=true,length=19,scale=0)
	public Date getNextRefreshTime(){
		return this.nextRefreshTime;
	}

	/**
	 * 设置  nextRefreshTime
	 *@param: nextRefreshTime  下次刷新时间
	 */
	public void setNextRefreshTime(Date nextRefreshTime){
		this.nextRefreshTime = nextRefreshTime;
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
	 * 获取  lastRefreshTime
	 *@return: Date  上次刷新时间
	 */
	@Column(name ="last_refresh_time",nullable=true,length=19,scale=0)
	public Date getLastRefreshTime(){
		return this.lastRefreshTime;
	}

	/**
	 * 设置  lastRefreshTime
	 *@param: lastRefreshTime  上次刷新时间
	 */
	public void setLastRefreshTime(Date lastRefreshTime){
		this.lastRefreshTime = lastRefreshTime;
	}
	/**
	 * 获取  refreshCycle
	 *@return: Integer  副本刷新周期 天数
	 */
	@Column(name ="refresh_cycle",nullable=true,length=10,scale=0)
	public Integer getRefreshCycle(){
		return this.refreshCycle;
	}

	/**
	 * 设置  refreshCycle
	 *@param: refreshCycle  副本刷新周期 天数
	 */
	public void setRefreshCycle(Integer refreshCycle){
		this.refreshCycle = refreshCycle;
	}
	/**
	 * 获取  dungeonName
	 *@return: String  副本名字
	 */
	@Column(name ="dungeon_name",nullable=true,length=255,scale=0)
	public String getDungeonName(){
		return this.dungeonName;
	}

	/**
	 * 设置  dungeonName
	 *@param: dungeonName  副本名字
	 */
	public void setDungeonName(String dungeonName){
		this.dungeonName = dungeonName;
	}
	
}
