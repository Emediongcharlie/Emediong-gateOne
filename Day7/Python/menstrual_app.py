from datetime import date, datetime, timedelta
	
	date_last_period_ended = input("when did our last period end(dd/MM/yyyy):")
	format = "%d/%m/%Y"
	last_period_ending_date = datetime.strptime(date_last_period_ended,format).date() 


	cycle_length = int(input("How long does your period cylcle last"))

	print(last_period_ending_date)

	next_cycle_begins = last_period_ending_date + timedelta(cycle_length)
	print("next cycle begins", next_cycle_begins)

	ovulation_day = next_cycle_begins - timedelta(days = 14)
	print("Ovulation date is ", ovulation_day)

	five_days_before = ovulation_day - timedelta(days = 5)
	one_day_after = ovulation_day + timedelta(days = 1)
	print(f"fertility_period is between {five_days_before} and  {one_day_after}")
	print("Every other day outside the fertility period is safe")






