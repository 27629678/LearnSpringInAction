package com.xoyo.knights;

public class BraveKnight extends Knight {

    private Quest quest;

    // constructor injection
    // DI所带来的最大收益——松耦合
    // 如果一个对象只通过接口（而不是具体实现和初始化过程）来表明
    // 依赖关系，那么这种依赖就能够在对象本身毫不知情的情况下，用
    // 不同的具体实现进行替换。
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embarkOnQuest();
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}
