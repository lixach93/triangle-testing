
# Task 4 – Domain Testing

## 1. Input Domain Analysis

The system accepts three integers: a, b and c.

| Domain | Equivalence Class | Description | Expected Result |
|---|---|---|---|
| Input validation | Positive integers | All sides are greater than zero | Valid input |
| Input validation | Zero value | At least one side equals zero | Invalid input |
| Input validation | Negative value | At least one side is negative | Invalid input |
| Triangle existence | Valid triangle | Sum of any two sides is greater than the third side | Triangle exists |
| Triangle existence | Boundary case | Sum of two sides equals the third side | Invalid triangle |
| Triangle existence | Invalid triangle | Sum of two sides is less than the third side | Invalid triangle |
| Classification | Right-angled | a² + b² = c² (c is longest side) | RIGHT_ANGLED |
| Classification | Acute-angled | a² + b² > c² (c is longest side) | ACUTE_ANGLED |
| Classification | Obtuse-angled | a² + b² < c² (c is longest side) | OBTUSE_ANGLED |

## 2. Selected Test Values

| Test ID | a | b | c | Test Scenario | Expected Result |
|---|---:|---:|---:|---|---|
| TC01 | 3 | 4 | 5 | Right-angled triangle | RIGHT_ANGLED |
| TC02 | 5 | 3 | 4 | Different order of sides | RIGHT_ANGLED |
| TC03 | 1 | 1 | 1 | Minimum valid triangle | ACUTE_ANGLED |
| TC04 | 5 | 5 | 5 | Equilateral triangle | ACUTE_ANGLED |
| TC05 | 4 | 5 | 6 | Acute-angled triangle | ACUTE_ANGLED |
| TC06 | 2 | 3 | 4 | Obtuse-angled triangle | OBTUSE_ANGLED |
| TC07 | 3 | 4 | 6 | Obtuse-angled triangle | OBTUSE_ANGLED |
| TC08 | 1 | 2 | 3 | Boundary condition | INVALID |
| TC09 | 1 | 2 | 4 | Invalid triangle | INVALID |
| TC10 | 5 | 1 | 1 | Invalid triangle | INVALID |
| TC11 | 0 | 3 | 4 | Zero value | INVALID |
| TC12 | -1 | 3 | 4 | Negative value | INVALID |
| TC13 | 3 | 0 | 4 | Zero value | INVALID |
| TC14 | 3 | 4 | -5 | Negative value | INVALID |

## 3. Testing Techniques

1. Equivalence Partitioning
2. Boundary Value Analysis
3. Positive Testing
4. Negative Testing
5. Input Permutation Testing

## 4. Unit Test Mapping

| Unit Test Method | Purpose |
|---|---|
| shouldValidateInput() | Checks positive, zero and negative values |
| shouldCheckTriangleExistence() | Checks valid and invalid triangles |
| shouldDetermineTriangleType() | Checks all triangle types |
| shouldRecognizeMinimumValidTriangle() | Checks minimum valid triangle |
