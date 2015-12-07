package com.afrozaar.wordpress.wpapi.v2;

import com.afrozaar.wordpress.wpapi.v2.api.Meta;
import com.afrozaar.wordpress.wpapi.v2.api.Posts;
import com.afrozaar.wordpress.wpapi.v2.api.Taxonomies;
import com.afrozaar.wordpress.wpapi.v2.api.Terms;
import com.afrozaar.wordpress.wpapi.v2.response.PagedResponse;

public interface Wordpress extends Posts, Meta, Taxonomies, Terms {
    String CONTEXT = "/wp-json/wp/v2";

    <T> PagedResponse<T> getPagedResponse(String context, Class<T> typeRef, String... expandParams);
}
