const express = require("express")
const fs = require('fs')
const app = express();
app.use(express.json())
app
    .route("/")
    .get((req, res) => {
        fs.readFile("./dummy/event.json", "utf-8", (err, data) => {
            if (err) {
                console.log(err);
            } else {
                data = JSON.parse(data);
                res.json(data);
            }
        })
    })
    .post((req, res) => {
        try {
            events = fs.readFileSync("./dummy/event.json", "utf-8");
            events = JSON.parse(events);
            console.log(events.event.length);
        } catch (error) {
            return res.status(500).json({ error: "Failed to read the event file." });
        }
        const newEvent = {
            "id": req.body.id,
            "title": req.body.title,
            "description": req.body.description,
            "eventOn": req.body.eventOn
        }
        if (!Array.isArray(events.event)) {
            events.event = [];
        }
        events.event.push(newEvent);

        fs.writeFile("./dummy/event.json", JSON.stringify(events, null, 2), (err) => {
            if (err) {
                console.log(err);
                return res.status(500).json({ error: "Failed to update the event file." });
            }
            res.status(201).json({ message: "Event added successfully!", event: newEvent });
        })
    })

app.listen(3000, () => console.log("server is listening"))