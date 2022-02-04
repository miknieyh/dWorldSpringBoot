/**
 * 
 */

document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
      initialView: 'dayGridMonth',
      locale: 'ko',
      events: [{
    	title: 'All Day Event',
    	start: '2022-01-02'
    	
    }]});
    calendar.render();
  });