package com.entity.view;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 论坛
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 帖子类型的值
		*/
		private String forumValue;
		/**
		* 帖子状态的值
		*/
		private String forumStateValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

		//级联表 zuozhe
			/**
			* 作者姓名
			*/
			private String zuozheName;
			/**
			* 作者手机号
			*/
			private String zuozhePhone;
			/**
			* 作者身份证号
			*/
			private String zuozheIdNumber;
			/**
			* 作者头像
			*/
			private String zuozhePhoto;

		//级联表 users
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 帖子类型的值
			*/
			public String getForumValue() {
				return forumValue;
			}
			/**
			* 设置： 帖子类型的值
			*/
			public void setForumValue(String forumValue) {
				this.forumValue = forumValue;
			}
			/**
			* 获取： 帖子状态的值
			*/
			public String getForumStateValue() {
				return forumStateValue;
			}
			/**
			* 设置： 帖子状态的值
			*/
			public void setForumStateValue(String forumStateValue) {
				this.forumStateValue = forumStateValue;
			}




























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}









				//级联表的get和set zuozhe
					/**
					* 获取： 作者姓名
					*/
					public String getZuozheName() {
						return zuozheName;
					}
					/**
					* 设置： 作者姓名
					*/
					public void setZuozheName(String zuozheName) {
						this.zuozheName = zuozheName;
					}
					/**
					* 获取： 作者手机号
					*/
					public String getZuozhePhone() {
						return zuozhePhone;
					}
					/**
					* 设置： 作者手机号
					*/
					public void setZuozhePhone(String zuozhePhone) {
						this.zuozhePhone = zuozhePhone;
					}
					/**
					* 获取： 作者身份证号
					*/
					public String getZuozheIdNumber() {
						return zuozheIdNumber;
					}
					/**
					* 设置： 作者身份证号
					*/
					public void setZuozheIdNumber(String zuozheIdNumber) {
						this.zuozheIdNumber = zuozheIdNumber;
					}
					/**
					* 获取： 作者头像
					*/
					public String getZuozhePhoto() {
						return zuozhePhoto;
					}
					/**
					* 设置： 作者头像
					*/
					public void setZuozhePhoto(String zuozhePhoto) {
						this.zuozhePhoto = zuozhePhoto;
					}





			//级联表的get和set users
					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}
					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
