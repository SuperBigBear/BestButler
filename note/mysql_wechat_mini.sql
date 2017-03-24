
 CREATE TABLE customer_info
 (
 user_id char(36) primary key not null,
 wechat_open_id varchar(50) null,
 user_name varchar(50),
 nick_name varchar(50),
 head_imgurl varchar(500),
 unionid varchar(100) null,
 gender int ,
 province varchar(50),
 city varchar(50),
 country varchar(50)
 )engine=innodb default charset=utf8;
 
CREATE TABLE sales_order
 (
 order_id char(36) primary key not null,
 goods_category_id char(36) null default null,/*服装 鞋袜 腰带....*/
 order_trackingnumber varchar(50) null default null, /*自动生成*/
 order_title nvarchar(500) null default null,/*购买品牌名称 标题*/
 order_buyer_description nvarchar(5000) null default null,/*购买者的需求描述 和注意事项*/
 order_boss_description nvarchar(5000) null default null,/*店家备注*/
 order_quantity int not null default 1,/*购买的数量 最小为1*/
 deal_price decimal(14,2) not null default 0.00,/*与店家谈妥成交价格*/
 checkout_date datetime null default null, /*正式提交订单日期*/
 order_address_id varchar(36) null default null,/*地址*/
 order_payment_type_id int null default null,/*微信支付 支付宝 现金 其它 四种方式*/
 order_status int not null default 0,/*订单状态：草稿 待付款 已付款  待发货(代购主后台确认点击后)  已发货 已完成 已取消*/
 created_dttm datetime not null,
 created_by nvarchar(50) null default null,
 updated_dttm datetime not null,
 updated_by nvarchar(50) null default null,
 transaction_id char(36) not null,
 
INDEX(goods_category_id),
INDEX(order_address_id),
INDEX(order_payment_type_id),
CONSTRAINT FOREIGN KEY (goods_category_id) REFERENCES goods_category(category_id)
      ON DELETE  RESTRICT  ON UPDATE CASCADE,
CONSTRAINT FOREIGN KEY (order_address_id) REFERENCES customer_address(address_id)
      ON DELETE  RESTRICT  ON UPDATE CASCADE ,
CONSTRAINT FOREIGN KEY (order_payment_type_id) REFERENCES enum_payment_type(id)
      ON DELETE  RESTRICT  ON UPDATE CASCADE 
      
 ) engine=innodb default charset=utf8;
 
  /*************************************DONE****************************************************/
 CREATE TABLE customer_address
 (
 address_id char(36) primary key not null,
 address_type char(10) null default null,/*B-账单地址(中国以外寄送账单要用)  S-发货地址（中国内）*/

 address_country_code varchar(36) null,
 address_state_id char(36)  null,
 address_city_id char(36) null default null,
 address_IsPrimary tinyint(1) default false,/*是否默认地址*/
 address_street_line1  nvarchar(500) null default null,
 address_street_line2  nvarchar(500) null default null,
  
 address_contact nvarchar(50) not null,/*联系人*/
 address_zipcode nvarchar(50) null default null,/*邮政*/
 address_mobile nvarchar(50) null default null,/*手机号*/
 address_company_name nvarchar(50) null,/*公司名称*/
 address_phone1 nvarchar(50) null default null,/*固定电话*/
 address_phont1_ext nvarchar(10) null default null,/*分机号*/
 
 created_dttm datetime not null,
 created_by nvarchar(50) null default null,
 updated_dttm datetime not null,
 updated_by nvarchar(50) null default null,
 transaction_id char(36) not null,
 
INDEX(address_state_id),
INDEX(address_city_id),
      
CONSTRAINT fk_customer_address_m_state_1 FOREIGN KEY (address_state_id) REFERENCES m_state(state_id)
      ON DELETE  RESTRICT  ON UPDATE CASCADE ,
      
CONSTRAINT fk_customer_address_m_city_1 FOREIGN KEY (address_city_id) REFERENCES m_city(city_id)
      ON DELETE  RESTRICT  ON UPDATE CASCADE    
 ) engine=innodb default charset=utf8;
 

 CREATE TABLE goods_category
 (
  category_id char(36) primary key not null,
  category_name nvarchar(100) null default null,
  parent_category_id char(36) null
  
 )engine=innodb default charset=utf8;
 
CREATE TABLE enum_payment_type
 (
 id int(11) not null primary key,
 payment_name enum('Wechat','Alipay','Cash','Other') NOT NULL  DEFAULT 'Other'
 ) engine=innodb default charset=utf8;
 
 CREATE TABLE m_country
 (
  country_id char(36) primary key not null,
  country_name nvarchar(100) null default null,
  country_code varchar(20) null default 'CN',
  language_name varchar(20) null default 'zh-CN',
  phone_code varchar(20) null default '86'
 )engine=innodb default charset=utf8;
 
  CREATE TABLE m_state
 (
  state_id char(36) primary key not null,
  country_code varchar(20) null default 'CN',
  state_code varchar(20) null default null,
  state_name nvarchar(100) null default null
 )engine=innodb default charset=utf8;
 
  CREATE TABLE m_city
 (
  city_id char(36) primary key not null,
  city_name nvarchar(100) null default null,
  state_id  char(36) null
 )engine=innodb default charset=utf8;
 