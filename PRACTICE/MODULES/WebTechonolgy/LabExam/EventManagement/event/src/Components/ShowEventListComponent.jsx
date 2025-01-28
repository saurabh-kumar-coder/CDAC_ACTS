import React from 'react'

const ShowEventListComponent = ({ EventList }) => {
    return (
        <div>
            <table>
                <thead>
                    <tr>
                        <th>
                            Event Name
                        </th>
                        <th>
                            Event Description
                        </th>
                        <th>
                            Event Date
                        </th>
                    </tr>
                </thead>
                <tbody>
                    {
                        EventList.length === 0 
                            ?
                            (
                                <tr>
                                    <td colSpan="3">No Data Found</td>
                                </tr>
                            )
                            :
                            (
                                EventList.map((e, index) => (
                                    <tr key={index}>
                                        <td>{e.eventName}</td>
                                        <td>{e.eventDescription}</td>
                                        <td>{e.eventDate}</td>
                                    </tr>
                                ))
                            )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ShowEventListComponent