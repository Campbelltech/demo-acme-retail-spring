package com.acmeretail.oms.domain.enums;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TaxClassDiffblueTest {
  /**
   * Test {@link TaxClass#isTaxable()}.
   *
   * <ul>
   *   <li>Given {@link TaxClass#REDUCED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TaxClass#isTaxable()}
   */
  @Test
  @DisplayName("Test isTaxable(); given REDUCED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TaxClass.isTaxable()"})
  void testIsTaxable_givenReduced_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(TaxClass.REDUCED.isTaxable());
  }

  /**
   * Test {@link TaxClass#isTaxable()}.
   *
   * <ul>
   *   <li>Given {@code STANDARD}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TaxClass#isTaxable()}
   */
  @Test
  @DisplayName("Test isTaxable(); given 'STANDARD'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TaxClass.isTaxable()"})
  void testIsTaxable_givenStandard_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(TaxClass.STANDARD.isTaxable());
  }

  /**
   * Test {@link TaxClass#isTaxable()}.
   *
   * <ul>
   *   <li>Given {@code ZERO_RATED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TaxClass#isTaxable()}
   */
  @Test
  @DisplayName("Test isTaxable(); given 'ZERO_RATED'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TaxClass.isTaxable()"})
  void testIsTaxable_givenZeroRated_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(TaxClass.ZERO_RATED.isTaxable());
  }
}
