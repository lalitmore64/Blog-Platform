package com.lalit.blog.mappers;

import com.lalit.blog.domain.PostStatus;
import com.lalit.blog.domain.dtos.CategoryDto;
import com.lalit.blog.domain.dtos.CreateCategoryRequest;
import com.lalit.blog.domain.entities.Category;
import com.lalit.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatedPostCount")
    CategoryDto toDto(Category category);

    Category toEntity(CreateCategoryRequest createCategoryRequest);

    @Named("calculatedPostCount")
    default long calculatedPostCount(List<Post> posts){
        if (null == posts){
            return 0;
        }
        return posts.stream()
                .filter(post -> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();
    }
}
