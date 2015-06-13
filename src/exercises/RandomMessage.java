package exercises;

import java.util.Random;

public class RandomMessage {
	public static void main(String[] args) {
		String[] phrases = {"��������� � �������.","���� � ��������� �������.", "��������� ������� ���� �������.","���� � ���-������� ������� �� ���� ���������."};
		String[] events ={"���� �� �������� �����.","����� �� �� �������.", "��� ������� ����.", "�� ���� �� ��������, �� ���� �� �������� ���������.", "�������� � ���. �� ��� ����� �������."};
		String[] autorsFirstName = {"�����", "����", "�����", "�����", "����"};
		String[] autorsLastName ={"�������", "�������", "������"};
		String[] towns ={"�����", "�������", "�����", "����", "������"};
		
		int phrase = phrases.length;
		int event = events.length;
		int autorFirstName = autorsFirstName.length;
		int autorLastName = autorsLastName.length;
		int town = towns.length;
		
		Random rand = new Random();
		
		int randomPhrase = rand.nextInt(phrase);
		String phrase1=phrases[randomPhrase];
		
		int randomEvent = rand.nextInt(event);
		String event1=events[randomEvent];
		
		int randomAutorFirstName = rand.nextInt(autorFirstName);
		String autor1 = autorsFirstName[randomAutorFirstName];
		
		int randomAutorLastName = rand.nextInt(autorLastName);
		String autor2 = autorsLastName[randomAutorLastName];
		
		int randomTown = rand.nextInt(town);
		String town1 = towns[randomTown];
		
		System.out.printf("%s %s%n %s %s - %s ",phrase1,event1,autor1,autor2,town1);
		
	}
}
