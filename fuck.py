subsistemas = [
        "Paneles",
        "Personal",
        "Equipaje",
        "Operaciones",
        "Financiera",
        "Incidencias",
        "Locales",
        "Estacionamiento",
        "Vuelos",
        "Seguridad"
        ]

for sub in subsistemas:
    print(f"JButton {sub}Button = new JButton(\"{sub}\");")

print()

for sub in subsistemas:
    print(f"buttonsPanel.add({sub}Button);")

string = '''		{}Button.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				
			}
		});'''
for sub in subsistemas:
    print(string.replace("{}", sub))
