# **PRIME NUMBERS**

## INFORMATION

* **Program to find prime numbers from 1 to 100.**

## **TECHNOLOGIES USED**

* **JAVA**

## **CONTENTS**

* The variables **i**, **n**, **start** and **end** are defined with int.

* Printing prime numbers with a for loop.

## **CODES**

```Java

        import java.util.Scanner;

        public class primenumbers {

            public static void main(String[] args) {

                int start = 2, end = 100, i, n;


```

```Java

                for (i = start; i <= end; i++){

                    boolean isPrime = true;

                    for (n = 2; n <= (i / 2); n++) {

                        if (i % n == 0) {

                            isPrime = false;

                            break;
                        }
                    }

                    if (isPrime){

                        System.out.print(i + "-");
                    }
                }
            }
        }

```

```bash

    2-3-5-7-11-13-17-19-23-29-31-37-41-43-47-53-59-61-67-71-73-79-83-89-97

```

<br />

## **LINK**

* Click here https://github.com/Fogo9/PrimeNumbers.git to access the Github page for this project.

<br />

## **LICENSE**

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
