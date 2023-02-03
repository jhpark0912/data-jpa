package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.Item;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired ItemRepository itemRepository;

    @Test
    public void save() throws Exception {
        //given
        Item item = new Item("A"); // -> 이 경우에는 persist가 아닌 merge가 진행됨
        itemRepository.save(item);
        //when

        //then

    }
}