package mapper;

import org.springframework.stereotype.Repository;

import entity.Blogger;

@Repository //注册为持久层的bean
public interface BloggerMapper {
	Blogger getBloggerData();

}
