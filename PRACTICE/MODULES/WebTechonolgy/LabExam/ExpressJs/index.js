const express = require("express");

const app = express();

var a = [
    {eventName: "event1", eventDescription: "description 1", eventDate: "10-12-2023"},
    {eventName: "event2", eventDescription: "description 2", eventDate: "20-12-2023"}
]
data = {eventName: "event3", eventDescription: "description 3", eventDate: "30-12-2023"}
app.route("/")
    .get((req, res) => {
        // a.map((e) => (
        //     res.append("eventName : " + e.eventName + " eventDescription : " + e.eventDescription + " eventDate : " + e.eventDate)
        // ))
        res.json(a);
    })
    .post((req, res) => {
        a.push(data);
        res.send("data added");
    })

app.listen(3000, () => {
    console.log("listening");
})