package yoti;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationalTest {

  @Test
  void initContext() {
    assertThat(true).isTrue();
  }
}
