package ndt.software.schedule.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ndt.software.schedule.entity.CronExpression;

@Repository
public interface CronExpressionRepository extends JpaRepository<CronExpression, Integer>{

	@Query(name = "select * from cron_expression",nativeQuery = true)
	public List<CronExpression> selectFrom();
}
