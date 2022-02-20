package moe.aluneed.mwl.content.service;

import moe.aluneed.mwl.content.model.Content;

import java.util.List;

public interface ContentService {

    Content getContentById(String contentId);

    List<Content> getContentList();



}
