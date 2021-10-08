package za.ac.nwu.ac.logic.flow.impl;

import org.hibernate.persister.walking.spi.WalkingException;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.translator.MemberTranslator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class CreateMemberFlowImplTest {
    @Mock
    private MemberTranslator translator;

    @InjectMocks
    private CreateMemberFlowImpl flow;

    @Before
    void setUp() throws Exception {
    }

    @After
    void tearDown() throws Exception {
    }

    @Test
    void create() {

        //when(translator.create(eq(null))).thenReturn(new MemberDto("JAN", "MALAN", 5));
        //MemberDto result = flow.create(new MemberDto());
        //assertNull(result);
        //verify(translator, times(1)).create(eq(null));
        //verify(translator, times(1)).create(eq(new MemberDto()));

    }
}