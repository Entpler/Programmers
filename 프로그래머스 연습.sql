--���α׷��ӽ� 1. ������ ��� ã��
--�Ծ��� �� ����� �ִµ�, ��ȣ�ҿ� ���� ����� ���� ������ ID�� �̸��� ID ������ ��ȸ�ϴ� SQL��
--ANIMAL_OUTS ���̺��� ���� ��ȣ�ҿ��� �Ծ� ���� ������ ������ ���� ���̺�
--ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺�


SELECT O.ANIMAL_ID,O.NAME 
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_ID(+)=O.ANIMAL_ID--LEFT OUT JOIN ���
AND (O.ANIMAL_ID IS NOT NULL AND I.ANIMAL_ID IS NULL)
ORDER BY O.ANIMAL_ID;


--2. �־��µ��� �������ϴ�

--�������� �Ǽ��� �Ϻ� ������ �Ծ����� �߸� �ԷµǾ����ϴ�.
--��ȣ �����Ϻ��� �Ծ����� �� ���� ������ ���̵�� �̸��� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
--�̶� ����� ��ȣ �������� ���� ������ ��ȸ�ؾ��մϴ�.
SELECT O.ANIMAL_ID,O.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_INS=A.ANIMAL_OUTS
AND O.DATETIME<I.DATETIME
ORDER BY O.DATETIME ASC;


--3.�̸��� el�� ���� ���� ã��
--���� ��ȣ�ҿ� ���� ���� �̸� ��, �̸��� "EL"�� ���� ���� ���̵�� �̸��� ��ȸ�ϴ� SQL���� �ۼ�
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
WHERE ANIMAL_TYPE='Dog'
AND Upper(NAME) LIKE '%EL%' --el�� �� �ҹ��ڸ� �������� ����.
ORDER BY NAME;


--4.���� ���� �� ã��
--���� ��ȣ�ҿ� ���� ���� �̸� �� �� �� �̻� ���� �̸��� �ش� �̸��� ���� Ƚ���� ��ȸ�ϴ� SQL��
SELECT NAME,COUNT(NAME)
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME --GROUP �Լ��� GROUP BY���� ������ �ϰ� �Ⱦ��� not a single-group group function ������ �߻��Ѵ�.
HAVING COUNT(NAME)>=2 --�̸��� �ι��̻� ����
ORDER BY NAME;


--5. ����̿� ���� ��� ������
--���� ��ȣ�ҿ� ���� ���� �� ����̿� ���� ���� �� �������� ��ȸ�ϴ� SQL��
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC;--����̸� ������ ���� ��ȸ



