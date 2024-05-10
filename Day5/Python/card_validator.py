def card_validator(card_number):

	number = 0
	count = 0

	for numbers in card_number:
		count += 1
		
	
	if count == 16:
		return True
	if card_number.split("-"):
		return True
	if card_number.startswith("4"):
		return True
	if card_number.startswith("5"):
		return True
	if card_number.startswith("6"):
		return True
	else:
		return False
