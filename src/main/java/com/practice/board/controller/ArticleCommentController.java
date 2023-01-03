package com.practice.board.controller;

import com.practice.board.domain.ArticleComment;
import com.practice.board.domain.constant.FormStatus;
import com.practice.board.domain.constant.SearchType;
import com.practice.board.dto.UserAccountDto;
import com.practice.board.dto.request.ArticleCommentRequest;
import com.practice.board.dto.request.ArticleRequest;
import com.practice.board.dto.response.ArticleResponse;
import com.practice.board.dto.response.ArticleWithCommentsResponse;
import com.practice.board.service.ArticleCommentService;
import com.practice.board.service.ArticleService;
import com.practice.board.service.PaginationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {

    private final ArticleCommentService articleCommentService;

    @PostMapping("/new")
    public String postNewArticleComment(ArticleCommentRequest articleCommentRequest) {
        // TODO: 인증 정보를 넣어줘야 한다.
        articleCommentService.saveArticleComment(articleCommentRequest.toDto(UserAccountDto.of(
                "id1", "awdr1234", "id1@mail.com", "갑", "memo"
        )));
        return "redirect:/articles/" + articleCommentRequest.articleId();
    }
    @PostMapping("/{commentId}/delete")
    public String deleteArticleComment(@PathVariable Long commentId, Long articleId) {
        articleCommentService.deleteArticleComment(commentId);
        return "redirect:/articles/" + articleId;
    }

}