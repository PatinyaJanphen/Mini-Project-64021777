import http from 'k6/http';
import { sleep } from 'k6';
import { Counter } from 'k6/metrics';

export const options = {
    stages: [
        {duration:'10s', target: 100},
        {duration:'30s', target: 100},
        {duration:'10s', target: 100},
        {duration:'30s', target: 100},
        {duration:'1m', target: 100},
    ],
};

export let my_custom_metric = new Counter("my_custom_metric");

export default function () {
  let response = http.get("https://pongvarid.github.io/probation_client_nuxt/?fbclid#/auth/register");
  check(response, {
    "status is 200": (r) => r.status === 200,
  });
  // Increment the custom metric based on some condition
  if (response.timings.duration < 500) {
    my_custom_metric.add(1);
  }
  sleep(1);
};
