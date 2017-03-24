package cn.nuist.chenlong.dao;

import org.apache.ibatis.annotations.Param;


public interface TicketDAO {
	public TicketDAO getTicketByID(@Param("id")int id);
}
